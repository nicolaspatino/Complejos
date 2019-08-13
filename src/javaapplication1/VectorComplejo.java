/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author 2112712
 */
public class VectorComplejo extends ArrayList<Complejo>{
        private Funciones a;
        public VectorComplejo(){      
            this.a=new Funciones();
        }
        public Complejo[] SumaVectores(Complejo []v1, Complejo[]v2){
            Complejo [] rta=new Complejo[v1.length];
            for (int x=0; x < v1.length; x++){
                rta[x]=a.Suma(v1[x],v2[x]);              
            }            
            return rta;
        }
    }

