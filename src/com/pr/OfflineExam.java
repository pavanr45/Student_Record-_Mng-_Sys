package com.pr;

public class OfflineExam extends Exam {

    void examResult(int marks) {   // Accept marks as parameter
        if(marks >= 40) {
            System.out.println("Congratulations...!");
        } else {
            System.out.println("Better luck next time! Work harder...");
        }
    }

}
