package com.academy.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestWhileLoopChallenge {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isEvenNumber() {
        Assertions.assertTrue(WhileLoopChallenge.isEvenNumber(2));
        Assertions.assertTrue(WhileLoopChallenge.isEvenNumber(6));
        Assertions.assertTrue(WhileLoopChallenge.isEvenNumber(18));
        Assertions.assertTrue(WhileLoopChallenge.isEvenNumber(20));

        Assertions.assertFalse(WhileLoopChallenge.isEvenNumber(5));
        Assertions.assertFalse(WhileLoopChallenge.isEvenNumber(11));
        Assertions.assertFalse(WhileLoopChallenge.isEvenNumber(19));
    }
}