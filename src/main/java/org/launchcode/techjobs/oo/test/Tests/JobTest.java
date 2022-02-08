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
        test_job = new Job("Web Designer", new Employer("Apple"), new Location("North Carolina"), new PositionType("Web Dev"), new CoreCompetency("Project Management"));
        test_job2 = new Job("Web Programmer", new Employer("Meta"), new Location("Florida"), new PositionType("Back-End Dev"), new CoreCompetency("Organizer"));
    }

    @Test
    public void testSettingJobId() {

        assertTrue(test_job.getId() < test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job3.getName() != null);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test_job4 = new Job("Webmaster", new Employer("Amazon"), new Location("New York"), new PositionType("Management"), new CoreCompetency("Organized"));
        Job test_job5 = new Job("Webmaster", new Employer("Amazon"), new Location("New York"), new PositionType("Management"), new CoreCompetency("Organized"));
        assertFalse(test_job4.equals(test_job5));
    }

    @Test
    public void checkStartAndEnd() {
        assertTrue(test_job.toString().startsWith("\n"));
        assertTrue(test_job.toString().endsWith("\n"));
    }


    @Test
    public void checkLabels() {
        assertEquals(test_job.toString(), "\n" + "ID: " + test_job.getId() + "\n" +
                "Name " + test_job.getName() + "\n" +
                "Employer " + test_job.getEmployer() + "\n" +
                "Location " + test_job.getLocation() + "\n" +
                "Position Type " + test_job.getPositionType() + "\n" +
                "Core Competency " + test_job.getCoreCompetency() + "\n");
    }

    @Test
    public void checkEmptyFields() {
        Job test_job6 = new Job("", new Employer("Amazon"), new Location("New York"), new PositionType("Management"), new CoreCompetency("Organized"));
        assertEquals(test_job6.getName(), "Data not available");
    }
}
