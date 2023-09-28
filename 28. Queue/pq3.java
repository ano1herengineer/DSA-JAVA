// Question 3 

// Job Sequencing Problem

// We have an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline.
// It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1.
// How to maximize total profit if only one job can be scheduled at a time.

// Sample Input:
// Number of jobs: 4
// Job ID: a b c d
// Deadline: 4 1 1 1
// Profit: 20 10 40 30

// Sample Output:
// Job Sequence: c a

// Time Complexity = O(n^2)
// Space Complexity = O(n)

import java.util.*;

public class pq3 {
    // Define a class to represent a job with its ID, deadline, and profit
    static class Job {
        char id;
        int deadline;
        int profit;

        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    // Comparator to sort jobs in decreasing order of profit
    static class JobComparator implements Comparator<Job> {
        @Override
        public int compare(Job job1, Job job2) {
            return job2.profit - job1.profit;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of jobs: ");
        int n = sc.nextInt();
        char id[] = new char[n];
        int deadline[] = new int[n];
        int profit[] = new int[n];
        System.out.println("Enter the job IDs: ");
        for (int i = 0; i < n; i++) {
            id[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the deadlines: ");
        for (int i = 0; i < n; i++) {
            deadline[i] = sc.nextInt();
        }
        System.out.println("Enter the profits: ");
        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextInt();
        }
        jobSequence(id, deadline, profit, n);
    }

    public static void jobSequence(char id[], int deadline[], int profit[], int n) {
        // Create a list to hold jobs
        List<Job> jobList = new ArrayList<>();
        
        // Add all jobs to the list
        for (int i = 0; i < n; i++) {
            jobList.add(new Job(id[i], deadline[i], profit[i]));
        }

        // Sort the jobs by decreasing order of profit
        Collections.sort(jobList, new JobComparator());

        // Initialize an array to track time slots
        int[] timeSlots = new int[n];

        // Assign jobs to time slots
        for (int i = 0; i < n; i++) {
            int slot = jobList.get(i).deadline - 1;
            while (slot >= 0 && timeSlots[slot] != 0) {
                slot--;
            }
            if (slot >= 0) {
                timeSlots[slot] = jobList.get(i).id;
            }
        }

        // Print the job sequence
        System.out.println("Job Sequence:");
        for (int i = 0; i < n; i++) {
            if (timeSlots[i] != 0) {
                System.out.print((char) timeSlots[i] + " ");
            }
        }
    }
}
