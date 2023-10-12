// Job Sequencing Problem

// Given an array of jobs where every job has a deadline and profit if the job is finished before deadline.
// It is also given that every job takes a single unit of time, so the minimum possible deadline for any 
// job is 1. Maximize the total profit if only 1 job can be scheduled at a time.

// Given Testcases

// Job A = 4, 20
// Job B = 1, 20 
// Job C = 1, 30
// Job D = 1, 30

// Output = CA(First Job C is done then Job A )

// Greedy Approach 
// Sort the jobs according to profit 

import java.util.*;

public class jobsequencing {
    // Define a class to represent a job
    static class Job {
        int deadline; // The deadline by which the job needs to be completed
        int profit;   // The profit earned by completing the job
        int id;       // A unique identifier for the job (0 for A, 1 for B, 2 for C, 3 for D)

        public Job(int i, int d, int p) {
            // Constructor to initialize the job's properties
            deadline = d;  // Assign the deadline
            profit = p;    // Assign the profit
            id = i;        // Assign the unique identifier
        }
    }

    public static void main(String args[]) {
        // Information about the jobs: Each job has a deadline and profit.
        // The format is {deadline, profit}.
        int jobsInfo[][] = {{4, 20}, {1, 20}, {1, 40}, {1, 30}};

        // Create a list to hold job objects
        ArrayList<Job> jobs = new ArrayList<>();

        // Populate the list of jobs with information from jobsInfo
        for (int i = 0; i < jobsInfo.length; i++) {
            int deadline = jobsInfo[i][0];
            int profit = jobsInfo[i][1];
            jobs.add(new Job(i, deadline, profit)); // Create a job object and add it to the list
        }

        // Sort the list of jobs in descending order of profit
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        // Create a list to store the job sequence for maximum profit
        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0; // Initialize the current time
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i); // Get the current job
            if (curr.deadline > time) {
                // If the job's deadline is after the current time, add it to the sequence
                seq.add(curr.id);
                time++; // Increment the current time
            }
        }

        // Print the results
        System.out.println("Maximum Jobs = " + seq.size()); // Number of jobs in the sequence
        System.out.println("Job Sequence for Maximum Profit = " + seq); // The job sequence itself
    }
}

// Output
// Maximum Jobs = 3
// Job Sequence for Maximum Profit = [2, 3, 0]
