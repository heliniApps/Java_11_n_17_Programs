package com.academy.eventhandling;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrintMessageController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField nameField;
    @FXML
    private Button welcomeButton;
    @FXML
    private Button farewellButton;
    @FXML
    private CheckBox clearCheckBox;
    @FXML
    private Label threadText;

    @FXML
    public void initialize() {
        disableButtons(true);
        clearCheckBox.setSelected(false);
        clearLabels();
    }

    @FXML
    void onKeyRelease() {
        clearLabels();
        String text = nameField.getText().trim();
        boolean isDisabled = text.isBlank();
        disableButtons(isDisabled);
    }

    @FXML
    void onButtonClick(ActionEvent event) {
        String message = "";
        String text = nameField.getText().trim();

        if (event.getSource().equals(welcomeButton)) {
            message = (text.isBlank() ? "Hello" : "Hello, ") + text;
        } else if (event.getSource().equals(farewellButton)) {
            message = (text.isBlank() ? "Bye" : "Bye, ") + text;
        }
        welcomeText.setText(message);

        if (clearCheckBox.isSelected()) {
            nameField.clear();
            disableButtons(true);
        }

        // Update the threadText Label on a background task.
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String msg = "Sleeping on, " + (Platform.isFxApplicationThread() ? "UI Thread" : " Background Task");
                    System.out.println(msg);

                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        String msg = "Updating label on, " + (Platform.isFxApplicationThread() ? "UI Thread" : " Background Task");
                        System.out.println(msg);

                        updateLabelThreadText(event);
                    }
                });
            }
        };
        new Thread(task).start();
    }

    @FXML
    void onCheckBoxChange() {
        System.out.println("CheckBox isSelected : " + clearCheckBox.isSelected());
    }

    private void disableButtons(boolean isDisabled) {
        welcomeButton.setDisable(isDisabled);
        farewellButton.setDisable(isDisabled);
    }

    private void updateLabelThreadText(ActionEvent buttonEvent) {
        String message = "";
        if (buttonEvent.getSource().equals(welcomeButton)) {
            message = "Welcome to Thread testing.";
        } else if (buttonEvent.getSource().equals(farewellButton)) {
            message = "See you later.";
        }
        threadText.setText(message);
    }

    private void clearLabels() {
        welcomeText.setText("");
        threadText.setText("");
    }
}