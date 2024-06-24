//package Refactor;
//
//public class LogicRefactor {
//    boolean hasMidRangeIncome = (income >= 40000) && (income <= 100000);
//    boolean hasHighIncome = (income > 100000);
//
//    boolean hasHighScore = (score > 700);
//    boolean hasMidScore = (score > 500);
//
//    if (!(hasHighScore || (hasMidRangeIncome && authorized && hasMidRangeScore) || hashighIncome)) {
//        reject();
//    } else {
//        accept();
//    }
//    //
//    if (score > 700)
//        accept();
//    else if ((income > 40000) && (income <= 100000) && authorized && (score > 500))
//        accept();
//    else if (income > 100000)
//        accept();
//    else
//        reject();
//    //
//    if ((score <= 700) && ((income < 40000)
//            || (income > 100000) || !authorized || (score <= 500)) &&
//            (income <= 100000))
//        reject();
//    else
//        accept();
//
//    boolean acceptable(int income, int score, boolean authorized) {
//        if (score > 700)
//            return true;
//        else if ((income > 40000) && (income <= 100000) && authorized && (score > 500))
//            return true;
//        else if (income > 100000)
//            return true;
//        else
//            return false;
//    }
//}
