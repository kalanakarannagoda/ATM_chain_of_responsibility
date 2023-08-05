/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Gui.Deposit;


public class Depositec extends Handler{

    @Override
    public double calculate(Amount amt) {
        double amount = 0;
        Deposit dep = new Deposit();
        if (amt.getCalculation()=="Deposit") {
            
            amount = amt.getAmount()+amt.getAmount2();
            amt.setAmount2(amount);
            dep.VerifiedMsg();//popup msg
            
            return amt.getAmount2();//returning the account balance
            
        }else{
            successor.calculate(amt);
            return amt.getAmount2();//returning the account balance
        }
    }
    
}
