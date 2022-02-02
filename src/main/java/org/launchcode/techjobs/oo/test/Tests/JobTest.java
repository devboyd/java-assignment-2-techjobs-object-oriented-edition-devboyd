package org.launchcode.techjobs.oo.test.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job;
    Job test_job2;

    @Before
    public void createJobObject() {
        test_job = new Job("Devin", new Employer("Apple"), new Location("North Carolina"), new PositionType("Web Dev"), new CoreCompetency("Project Management"));
        test_job2 = new Job("Brook", new Employer("Meta"), new Location("Florida"), new PositionType("Back-End Dev"), new CoreCompetency("Organizer"));
    }

    @Test
    public void testSettingJobId() {
        assertNotEquals(test_job.getNextId(), test_job2.getNextId(), .001);
    }
}
