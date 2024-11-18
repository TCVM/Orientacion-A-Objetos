package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;

    private void initializeJobs() {

        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private FIFO newFifoScheduler() {
        FIFO fifoScheduler = new FIFO();
        fifoScheduler.setStrategy("FIFO");
        return fifoScheduler;
    }

    private LIFO newLifoScheduler() {
        LIFO lifoScheduler = new LIFO();
        lifoScheduler.setStrategy("LIFO");
        return lifoScheduler;
    }

    private HighestPriority newPriorityScheduler() {
        HighestPriority priorityScheduler = new HighestPriority();
        priorityScheduler.setStrategy("HighestPriority");
        return priorityScheduler;
    }

    private MostEffort newEffortScheduler() {
        MostEffort effortScheduler = new MostEffort();
        effortScheduler.setStrategy("MostEffort");
        return effortScheduler;
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
        FIFO aSchedulerF = new FIFO();
        aSchedulerF.schedule(highestPriorityJob);
        assertTrue(aSchedulerF.getJobs().contains(highestPriorityJob));
        
        LIFO aSchedulerL = new LIFO();
        aSchedulerL.schedule(highestPriorityJob);
        assertTrue(aSchedulerL.getJobs().contains(highestPriorityJob));
        
        HighestPriority aSchedulerH = new HighestPriority();
        aSchedulerH.schedule(highestPriorityJob);
        assertTrue(aSchedulerH.getJobs().contains(highestPriorityJob));
        
        MostEffort aSchedulerM = new MostEffort();
        aSchedulerM.schedule(highestPriorityJob);
        assertTrue(aSchedulerM.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        FIFO aSchedulerF = new FIFO();
        this.scheduleJobsIn(aSchedulerF);
        aSchedulerF.unschedule(highestPriorityJob);
        assertFalse(aSchedulerF.getJobs().contains(highestPriorityJob));
        
        LIFO aSchedulerL= new LIFO();
        this.scheduleJobsIn(aSchedulerL);
        aSchedulerL.unschedule(highestPriorityJob);
        assertFalse(aSchedulerL.getJobs().contains(highestPriorityJob));
        
        HighestPriority aSchedulerH = new HighestPriority();
        this.scheduleJobsIn(aSchedulerH);
        aSchedulerH.unschedule(highestPriorityJob);
        assertFalse(aSchedulerH.getJobs().contains(highestPriorityJob));
        
        MostEffort aSchedulerM = new MostEffort();
        this.scheduleJobsIn(aSchedulerM);
        aSchedulerM.unschedule(highestPriorityJob);
        assertFalse(aSchedulerM.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler;
        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
