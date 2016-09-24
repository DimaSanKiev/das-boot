package com.boot.controller;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController sc;

    @Mock
    private ShipwreckRepository repository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet() throws Exception {
        Shipwreck sw = new Shipwreck();
        sw.setId(1L);

        when(repository.findOne(1L)).thenReturn(sw);
        Shipwreck wreck = sc.get(1L);
        verify(repository).findOne(1L);

//        assertEquals(1L, wreck.getId().longValue());
        assertThat(wreck.getId(), is(1L));
    }

}