package com.example.demo.exception;
import com.example.demo.practice.Student;

public class TransferMoney {

    public static void main(String[] args) {

//        String message = method("123", "345", 1234, 100);
//        String message1 = method1("123", "345", 1234, 100);
        Student s = new Student(1, "Hari");
        System.out.println(Student.studentCount);
    }

    public static String method(String fromAccountNo, String toAccountNo, int pin, float amount) {
        String message = initiateTransfer(fromAccountNo, toAccountNo, pin, amount);
        if (message.equals("Successful Transferred")) {
            sendMessage();
        }
        return message;
    }

    public static String method1(String fromAccountNo, String toAccountNo, int pin, float amount) {
        String message = null;
        try {
            message = initiateTransfer1(fromAccountNo, toAccountNo, pin, amount);
        }  catch (InvalidPinException invalidPinException) {
            updateInvalidPinCount();
            System.out.println("Invalid Pin Exception");
        } catch (InsufficientBalanceException insufficientBalanceException) {
            captureUserData();
            System.out.println("Insufficient Balance");
        } catch (AccountInactiveException accountInactiveException) {
            sentMessageForInactiveAccount();
            System.out.println("Account is not active");
        }
        return message;
    }

    private static void sendMessage() {
    }

    public static String initiateTransfer1(String fromAccountNo, String toAccountNo, int pin, float amount)
            throws InsufficientBalanceException, AccountInactiveException, InvalidPinException {
        if (didMaximumTransferForADay(fromAccountNo)) {
            return "You are not allowed to transfer more Money.";
        }
        return transferAmount(fromAccountNo, toAccountNo, pin, amount);
    }

    public static String initiateTransfer(String fromAccountNo, String toAccountNo, int pin, float amount) {
        if (didMaximumTransferForADay(fromAccountNo)) {
            return "You are not allowed to transfer more Money.";
        }
        try {
            String message = transferAmount(fromAccountNo, toAccountNo, pin, amount);
            sendMessage();
            return message;
        } catch (InvalidPinException invalidPinException) {
            updateInvalidPinCount();
            System.out.println("Invalid Pin Exception");
        } catch (InsufficientBalanceException insufficientBalanceException) {
            captureUserData();
            System.out.println("Insufficient Balance");
        } catch (AccountInactiveException accountInactiveException) {
            sentMessageForInactiveAccount();
            System.out.println("Account is not active");
        }
        return "Invalid";
    }

    private static void sentMessageForInactiveAccount() {
    }

    private static void captureUserData() {
    }

    private static void updateInvalidPinCount() {
        
    }

    private static boolean didMaximumTransferForADay(String fromAccountNo) {
        boolean v = true;
        return v;
    }

    public static String transferAmount(String fromAccountNo, String toAccountNo, int pin, float amount)
            throws InvalidPinException, InsufficientBalanceException, AccountInactiveException {
        if (!isValidPin(fromAccountNo, pin)) {
            throw new InvalidPinException();
        }
        if (!balanceAvailable(fromAccountNo, amount)) {
            throw new InsufficientBalanceException();
        }
        if (!accountActive(toAccountNo)) {
            throw new AccountInactiveException();
        }
        settleBalances(fromAccountNo, toAccountNo, amount);
        return "Successful Transferred";

    }

//    public static String transferAmount1(String fromAccountNo, String toAccountNo, int pin, float amount) {
//        if (!isValidPin(fromAccountNo, pin)) {
//            return "Invalid Pin";
//        }
//        if(!balanceAvailable(fromAccountNo, amount)) {
//            return "Insufficient Balance";
//        }
//        if(!accountActive(toAccountNo)) {
//            return "Receiver Account is not active";
//        }
//        settleBalances(fromAccountNo, toAccountNo, amount);
//        return "Successful Transferred";
//
//    }

    private static void settleBalances(String fromAccountNo, String toAccountNo, float amount) {
        //fromAccountNo - amount
        //toAcc
    }

    private static boolean accountActive(String toAccountNo) {
        boolean v = true;
        return v;
    }

    private static boolean balanceAvailable(String fromAccountNo, float amount) {
        boolean v = true;
        return v;
    }


    private static boolean isValidPin(String fromAccountNo, int pin) {
        boolean v = true;
        return v;
    }
}
