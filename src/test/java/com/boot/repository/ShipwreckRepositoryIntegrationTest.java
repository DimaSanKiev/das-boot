package com.boot.repository;

import com.boot.model.Shipwreck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository repository;

    @Test
    public void testFindAll() throws Exception {
        List<Shipwreck> wrecks = repository.findAll();
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}