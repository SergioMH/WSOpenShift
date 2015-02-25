/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.dds.ejbean;

import javax.ejb.Stateless;

/**
 *
 * @author Develop
 */
@Stateless
public class FactorialOShiftBean implements FactorialOShiftBeanRemote {
    @Override
    public long calcularFactorial(int n) {
        if (n<1) {
            return 1;
        }else{
            return n*calcularFactorial(n-1);
        }
    }
}
