package com.project.refactorMain;

public class Main {
    public static void main(String[] args) {

        int principal = (int) ReadNumber.readNumber("Principal: ", 1000,  1_000_000);
        float annualInterest= (float) ReadNumber.readNumber("Annual Interest Rate: ", 1 , 30);
        byte years = (byte) ReadNumber.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }

}
