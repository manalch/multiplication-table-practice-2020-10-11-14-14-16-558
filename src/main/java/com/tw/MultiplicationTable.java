package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        return isValid(startNumber, endNumber) ? generateMultiplicationTable(startNumber, endNumber) : null;
    }

    private String generateMultiplicationTable(int startNumber, int endNumber) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int multiplicand = startNumber; multiplicand <= endNumber; multiplicand++) {
            for (int multiplier = startNumber; multiplier <= multiplicand; multiplier++) {
                resultBuilder.append(multiplier)
                        .append("*")
                        .append(multiplicand)
                        .append("=")
                        .append(multiplicand * multiplier)
                        .append(multiplicand == multiplier ? "" : "  ");
            }
            resultBuilder.append("\r\n");
        }
        return resultBuilder.toString().trim();
    }

    private boolean isValid(int startNumber, int endNumber) {
        return checkStartNumLessThanEqualEndNum(startNumber, endNumber) && isWithInRange(startNumber, endNumber);
    }

    private boolean checkStartNumLessThanEqualEndNum(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }

    private boolean isWithInRange(int startNumber, int endNumber) {
        return (startNumber >= 1 && startNumber <= 1000) && (endNumber >= 1 && endNumber <= 1000);
    }
}
