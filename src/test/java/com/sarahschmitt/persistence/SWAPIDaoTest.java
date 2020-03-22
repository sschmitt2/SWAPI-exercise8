package com.sarahschmitt.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SWAPIDaoTest {

    @Test
    void getPetSuccess() {
        SWAPIDao dao = new SWAPIDao();
        assertEquals("testpet", dao.getPet().getName());
    }

}