/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.dds.ejbean;

import javax.ejb.Remote;

/**
 *
 * @author Develop
 */
@Remote
public interface FactorialOShiftBeanRemote {
    long calcularFactorial(int n);
}
