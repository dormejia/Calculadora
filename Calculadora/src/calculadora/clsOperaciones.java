/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Renato
 */
public class clsOperaciones {
    
    public double N1,N2,Result;

    public double getN1() {
        return N1;
    }

    public void setN1(double N1) {
        this.N1 = N1;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double N2) {
        this.N2 = N2;
    }

    public double getResult() {
        return Result;
    }

    public void setResult(double Result) {
        this.Result = Result;
    }

    public clsOperaciones(double N1, double N2, double Result) {
        this.N1 = N1;
        this.N2 = N2;
        this.Result = Result;
    }
    public clsOperaciones() {}
    // METODOS
    public double adicion(){
        Result = N1+N2;
        System.out.println(Result);
    return Result;
    }
    public double sustraccion(){
        Result = N1-N2;
    return Result;
    }
    public double multiplicacion(){
        Result = N1*N2;
    return Result;
    }
    public double divicion(){
        Result = N1/N2;
    return Result;
    }
    
    
}
