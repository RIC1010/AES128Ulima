/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
 * @author rseba
 */
public class mixColumns {
    String[][] matrix;
    int[][] matrixInt;
    int[][] matrixIntC0;
    int[][] matrixIntC1;
    int[][] matrixIntC2;
    int[][] matrixIntC3;
    int[][] matrixPolF1;
    int[][] matrixPolF2;
    int[][] matrixPolF3;
    int[][] matrixPolF4;
    String[][] matrixMixColTotal;
    String[][] matrixFinal;
    public static final int[][] galPolin;
    
    public mixColumns(final String[][] matrix) {
        this.matrix = new String[4][4];
        this.matrixInt = new int[4][4];
        this.matrixIntC0 = new int[4][1];
        this.matrixIntC1 = new int[4][1];
        this.matrixIntC2 = new int[4][1];
        this.matrixIntC3 = new int[4][1];
        this.matrixPolF1 = new int[1][4];
        this.matrixPolF2 = new int[1][4];
        this.matrixPolF3 = new int[1][4];
        this.matrixPolF4 = new int[1][4];
        this.matrixMixColTotal = new String[4][4];
        this.matrixFinal = new String[4][4];
        this.matrix = matrix;
    }
    
    public String[][] aplicaMixColumns() {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.matrixInt[j][i] = Integer.parseInt(this.matrix[j][i], 16);
            }
        }
        this.matrixPolF1[0][0] = mixColumns.galPolin[0][0];
        this.matrixPolF1[0][1] = mixColumns.galPolin[0][1];
        this.matrixPolF1[0][2] = mixColumns.galPolin[0][2];
        this.matrixPolF1[0][3] = mixColumns.galPolin[0][3];
        this.matrixPolF2[0][0] = mixColumns.galPolin[1][0];
        this.matrixPolF2[0][1] = mixColumns.galPolin[1][1];
        this.matrixPolF2[0][2] = mixColumns.galPolin[1][2];
        this.matrixPolF2[0][3] = mixColumns.galPolin[1][3];
        this.matrixPolF3[0][0] = mixColumns.galPolin[2][0];
        this.matrixPolF3[0][1] = mixColumns.galPolin[2][1];
        this.matrixPolF3[0][2] = mixColumns.galPolin[2][2];
        this.matrixPolF3[0][3] = mixColumns.galPolin[2][3];
        this.matrixPolF4[0][0] = mixColumns.galPolin[3][0];
        this.matrixPolF4[0][1] = mixColumns.galPolin[3][1];
        this.matrixPolF4[0][2] = mixColumns.galPolin[3][2];
        this.matrixPolF4[0][3] = mixColumns.galPolin[3][3];
        this.matrixIntC0[0][0] = this.matrixInt[0][0];
        this.matrixIntC0[1][0] = this.matrixInt[1][0];
        this.matrixIntC0[2][0] = this.matrixInt[2][0];
        this.matrixIntC0[3][0] = this.matrixInt[3][0];
        this.matrixIntC1[0][0] = this.matrixInt[0][1];
        this.matrixIntC1[1][0] = this.matrixInt[1][1];
        this.matrixIntC1[2][0] = this.matrixInt[2][1];
        this.matrixIntC1[3][0] = this.matrixInt[3][1];
        this.matrixIntC2[0][0] = this.matrixInt[0][2];
        this.matrixIntC2[1][0] = this.matrixInt[1][2];
        this.matrixIntC2[2][0] = this.matrixInt[2][2];
        this.matrixIntC2[3][0] = this.matrixInt[3][2];
        this.matrixIntC3[0][0] = this.matrixInt[0][3];
        this.matrixIntC3[1][0] = this.matrixInt[1][3];
        this.matrixIntC3[2][0] = this.matrixInt[2][3];
        this.matrixIntC3[3][0] = this.matrixInt[3][3];
        final int r1 = multiplyXor(this.matrixPolF1, this.matrixIntC0);
        final int r2 = multiplyXor(this.matrixPolF1, this.matrixIntC1);
        final int r3 = multiplyXor(this.matrixPolF1, this.matrixIntC2);
        final int r4 = multiplyXor(this.matrixPolF1, this.matrixIntC3);
        final int r5 = multiplyXor(this.matrixPolF2, this.matrixIntC0);
        final int r6 = multiplyXor(this.matrixPolF2, this.matrixIntC1);
        final int r7 = multiplyXor(this.matrixPolF2, this.matrixIntC2);
        final int r8 = multiplyXor(this.matrixPolF2, this.matrixIntC3);
        final int r9 = multiplyXor(this.matrixPolF3, this.matrixIntC0);
        final int r10 = multiplyXor(this.matrixPolF3, this.matrixIntC1);
        final int r11 = multiplyXor(this.matrixPolF3, this.matrixIntC2);
        final int r12 = multiplyXor(this.matrixPolF3, this.matrixIntC3);
        final int r13 = multiplyXor(this.matrixPolF4, this.matrixIntC0);
        final int r14 = multiplyXor(this.matrixPolF4, this.matrixIntC1);
        final int r15 = multiplyXor(this.matrixPolF4, this.matrixIntC2);
        final int r16 = multiplyXor(this.matrixPolF4, this.matrixIntC3);
        this.matrixMixColTotal[0][0] = Integer.toHexString(r1);
        this.matrixMixColTotal[0][1] = Integer.toHexString(r2);
        this.matrixMixColTotal[0][2] = Integer.toHexString(r3);
        this.matrixMixColTotal[0][3] = Integer.toHexString(r4);
        this.matrixMixColTotal[1][0] = Integer.toHexString(r5);
        this.matrixMixColTotal[1][1] = Integer.toHexString(r6);
        this.matrixMixColTotal[1][2] = Integer.toHexString(r7);
        this.matrixMixColTotal[1][3] = Integer.toHexString(r8);
        this.matrixMixColTotal[2][0] = Integer.toHexString(r9);
        this.matrixMixColTotal[2][1] = Integer.toHexString(r10);
        this.matrixMixColTotal[2][2] = Integer.toHexString(r11);
        this.matrixMixColTotal[2][3] = Integer.toHexString(r12);
        this.matrixMixColTotal[3][0] = Integer.toHexString(r13);
        this.matrixMixColTotal[3][1] = Integer.toHexString(r14);
        this.matrixMixColTotal[3][2] = Integer.toHexString(r15);
        this.matrixMixColTotal[3][3] = Integer.toHexString(r16);
        return this.matrixMixColTotal;
    }
    
    private static int multiplyXor(final int[][] fmp, final int[][] cm) {
        final byte[][] matrixPolinBin = new byte[1][4];
        final byte[][] matrixCmBin = new byte[4][1];
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int vf = 0;
        matrixPolinBin[0][0] = (byte)fmp[0][0];
        matrixPolinBin[0][1] = (byte)fmp[0][1];
        matrixPolinBin[0][2] = (byte)fmp[0][2];
        matrixPolinBin[0][3] = (byte)fmp[0][3];
        matrixCmBin[0][0] = (byte)cm[0][0];
        matrixCmBin[1][0] = (byte)cm[1][0];
        matrixCmBin[2][0] = (byte)cm[2][0];
        matrixCmBin[3][0] = (byte)cm[3][0];
        v1 = (multiply(matrixPolinBin[0][0], matrixCmBin[0][0]) & 0xFF);
        v2 = (multiply(matrixPolinBin[0][1], matrixCmBin[1][0]) & 0xFF);
        v3 = (multiply(matrixPolinBin[0][2], matrixCmBin[2][0]) & 0xFF);
        v4 = (multiply(matrixPolinBin[0][3], matrixCmBin[3][0]) & 0xFF);
        vf = (v1 ^ v2 ^ v3 ^ v4);
        return vf;
    }
    
    private static byte multiply(byte a, byte b) {
        byte returnValue = 0;
        byte temp = 0;
        while (a != 0) {
            if ((a & 0x1) != 0x0) {
                returnValue ^= b;
            }
            temp = (byte)(b & 0x80);
            b <<= 1;
            if (temp != 0) {
                b ^= 0x1B;
            }
            a = (byte)((a & 0xFF) >> 1);
        }
        return returnValue;
    }
    
    static {
        galPolin = new int[][] { { 2, 3, 1, 1 }, { 1, 2, 3, 1 }, { 1, 1, 2, 3 }, { 3, 1, 1, 2 } };
    }
}
