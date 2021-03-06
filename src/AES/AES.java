package AES;
import java.util.Scanner;
import Libreria.mixColumns;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rseba
 */
public class AES {
    static char [] SBOX = {
    0x63, 0x7C, 0x77, 0x7B, 0xF2, 0x6B, 0x6F, 0xC5, 0x30, 0x01, 0x67, 0x2B, 0xFE, 0xD7, 0xAB, 0x76,
    0xCA, 0x82, 0xC9, 0x7D, 0xFA, 0x59, 0x47, 0xF0, 0xAD, 0xD4, 0xA2, 0xAF, 0x9C, 0xA4, 0x72, 0xC0,
    0xB7, 0xFD, 0x93, 0x26, 0x36, 0x3F, 0xF7, 0xCC, 0x34, 0xA5, 0xE5, 0xF1, 0x71, 0xD8, 0x31, 0x15,
    0x04, 0xC7, 0x23, 0xC3, 0x18, 0x96, 0x05, 0x9A, 0x07, 0x12, 0x80, 0xE2, 0xEB, 0x27, 0xB2, 0x75,
    0x09, 0x83, 0x2C, 0x1A, 0x1B, 0x6E, 0x5A, 0xA0, 0x52, 0x3B, 0xD6, 0xB3, 0x29, 0xE3, 0x2F, 0x84,
    0x53, 0xD1, 0x00, 0xED, 0x20, 0xFC, 0xB1, 0x5B, 0x6A, 0xCB, 0xBE, 0x39, 0x4A, 0x4C, 0x58, 0xCF,
    0xD0, 0xEF, 0xAA, 0xFB, 0x43, 0x4D, 0x33, 0x85, 0x45, 0xF9, 0x02, 0x7F, 0x50, 0x3C, 0x9F, 0xA8,
    0x51, 0xA3, 0x40, 0x8F, 0x92, 0x9D, 0x38, 0xF5, 0xBC, 0xB6, 0xDA, 0x21, 0x10, 0xFF, 0xF3, 0xD2,
    0xCD, 0x0C, 0x13, 0xEC, 0x5F, 0x97, 0x44, 0x17, 0xC4, 0xA7, 0x7E, 0x3D, 0x64, 0x5D, 0x19, 0x73,
    0x60, 0x81, 0x4F, 0xDC, 0x22, 0x2A, 0x90, 0x88, 0x46, 0xEE, 0xB8, 0x14, 0xDE, 0x5E, 0x0B, 0xDB,
    0xE0, 0x32, 0x3A, 0x0A, 0x49, 0x06, 0x24, 0x5C, 0xC2, 0xD3, 0xAC, 0x62, 0x91, 0x95, 0xE4, 0x79,
    0xE7, 0xC8, 0x37, 0x6D, 0x8D, 0xD5, 0x4E, 0xA9, 0x6C, 0x56, 0xF4, 0xEA, 0x65, 0x7A, 0xAE, 0x08,
    0xBA, 0x78, 0x25, 0x2E, 0x1C, 0xA6, 0xB4, 0xC6, 0xE8, 0xDD, 0x74, 0x1F, 0x4B, 0xBD, 0x8B, 0x8A,
    0x70, 0x3E, 0xB5, 0x66, 0x48, 0x03, 0xF6, 0x0E, 0x61, 0x35, 0x57, 0xB9, 0x86, 0xC1, 0x1D, 0x9E,
    0xE1, 0xF8, 0x98, 0x11, 0x69, 0xD9, 0x8E, 0x94, 0x9B, 0x1E, 0x87, 0xE9, 0xCE, 0x55, 0x28, 0xDF,
    0x8C, 0xA1, 0x89, 0x0D, 0xBF, 0xE6, 0x42, 0x68, 0x41, 0x99, 0x2D, 0x0F, 0xB0, 0x54, 0xBB, 0x16};
    public static String[][] subBytes(String [][] arr){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int indice=Integer.parseInt(arr[i][j], 16);
                arr[i][j]=Integer.toHexString(SBOX[indice]);
            }
        }
        return arr;
    }
    public static String [][] addroundKey(char [][] matrix, char [][] matrixKey){
        String [][] add= new String [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                add[i][j]=Integer.toHexString(matrix[i][j]^matrixKey[i][j]);
            }
        }
        return add;
    }
    public static String [][] shiftRows(String arr[][]){
        //Primera fila
        String aux=arr[1][0];
        arr[1][0]=arr[1][1];
        arr[1][1]=arr[1][2];
        arr[1][2]=arr[1][3];
        arr[1][3]=aux;
        //Segunda fila
        aux=arr[2][0];
        arr[2][0]=arr[2][2];
        arr[2][2]=arr[2][1];
        arr[2][1]=arr[2][3];
        arr[2][3]=arr[2][2];
        arr[2][2]=aux;
        //tercera fila
        aux=arr[3][3];
        arr[3][3]=arr[3][2];
        arr[3][2]=arr[3][1];
        arr[3][1]=arr[3][0];
        arr[3][0]=aux;
        return arr;
        
    }
    public static char[][] convertir(String s){
        char [][] matrix= new char[4][4];
        int aux=0;
        int x=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[j][i]=s.charAt(aux);
                //matrixKey[j][i]=key.charAt(aux);
                aux++;
                
            }
        }
        return matrix;
    }
    public static char[][] convertirLlave(String s){
        char [][] matrix= new char[4][4];
        int aux=0;
        int x=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[j][i]=(char)Integer.parseInt(s.substring(aux,aux+2),16);
                //matrixKey[j][i]=key.charAt(aux);
                aux+=2;
                
            }
        }
        return matrix;
    }
    public static char [][] converMatrix(String[][]arr){
        char [][] matrix= new char[4][4];
        int aux=0;
        int x=0;
        for (int i = 0; i < 4; i++) {
            if(x==0){
                for (int j = 0; j < 4; j++) {
                    matrix[j][i]=(char)Integer.parseInt(arr[j][i],16);
                    //matrixKey[j][i]=key.charAt(aux);
                    aux++;
                    x++;
                }
            }else{
                for (int j = 3; j >= 0; j--) {
                    matrix[j][i]=(char)Integer.parseInt(arr[j][i],16);
                    //matrixKey[j][i]=key.charAt(aux);
                    aux++;   
                    x--;
                }
            }
        }
        return matrix;
    }
    public static String resol(String s, String key) {
        String [] llaves={"",
            "d6aa74fdd2af72fadaa678f1d6ab76fe",
            "b692cf0b643dbdf1be9bc5006830b3fe",
            "b6ff744ed2c2c9bf6c590cbf0469bf41",
            "47f7f7bc95353e03f96c32bcfd058dfd",
            "3caaa3e8a99f9deb50f3af57adf622aa",
            "5e390f7df7a69296a7553dc10aa31f6b",
            "14f9701ae35fe28c440adf4d4ea9c026",
            "47438735a41c65b9e016baf4aebf7ad2",
            "549932d1f08557681093ed9cbe2c974e",
            "13111d7fe3944a17f307a78b4d2b30c5"
        };
        //Scanner scan = new Scanner(System.in);
        //String s=scan.next();
        //String key=llaves[0];
        char [][] matrix;
        char [][] matrixKey;
        //primera pasada: 
        matrix=convertir(s);
        matrixKey=convertirLlave(key);
        String [][] add=addroundKey(matrix,matrixKey);
        for (int i = 1; i < 10; i++) {
            //subBytes
            add=subBytes(add);
            //shiftRows
            add=shiftRows(add);
            //mixColumns
            mixColumns nvoAdd= new mixColumns(add);
            add=nvoAdd.aplicaMixColumns();
            char [][] cLlave=convertirLlave(llaves[i]);
            add=addroundKey(converMatrix(add),cLlave);
        }
        ////??ltima ronda: 
            //subBytes
            add=subBytes(add);
            //shiftRows
            add=shiftRows(add);
            char [][] cLlave=convertirLlave(llaves[10]);
            add=addroundKey(converMatrix(add),cLlave);
        
        //Finaliza Proceso de encriptaci??n
        String respuesta="";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(add[j][i].length()==1){
                    respuesta+="0"+add[j][i];
                }else{
                    respuesta+=add[j][i];
                }        
            }
        }
        return respuesta;
    }
}
