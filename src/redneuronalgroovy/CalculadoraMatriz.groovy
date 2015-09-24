/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Esteban
 */
package redneuronalgroovy

class CalculadoraMatriz {
    def m=3;
    def n=3;
    def o=3;
    def p=3;
    def m1=new int[m][n];
    def m2=new int[n][p];
    def mr=new int[m][p];
    
    public static void main(String[] args){
        IntRange.metaClass.random = { -> (Math.random() * (delegate.to - delegate.from + 1) + delegate.from) as int}
        new CalculadoraMatriz();
    }
    
    public CalculadoraMatriz(){
        generarMatriz();
        multiplicar();
        sumar();
        restar();
    }
    
    
    public void generarMatriz(){
        m1[0][0]=2;
        m1[0][1]=0;
        m1[0][2]=1;
        m1[1][0]=3;
        m1[1][1]=0;
        m1[1][2]=0;
        m1[2][0]=5;
        m1[2][1]=1;
        m1[2][2]=1;
     
        m2[0][0]=1;
        m2[0][1]=0;
        m2[0][2]=1;
        m2[1][0]=1;
        m2[1][1]=2;
        m2[1][2]=1;
        m2[2][0]=1;
        m2[2][1]=1;
        m2[2][2]=0;
        println m1
        println m2
        
        /*   for(Integer i=0;i<m;i++){
        for(Integer j=0;j<n;j++){
        m1[i][j]=(-2..2).random();
        }
        }   
     
        for(Integer i=0;i<o;i++){
        for(Integer j=0;j<p;j++){
        m2[i][j]=(-2..2).random();
        }
        }*/
    }
    
    public void multiplicar(){
        if(m==p){
            def mR=new int[m][p]
        
            for(int i=0;i<n;i++){
                for(int j=0;j<o;j++){
                    for(int h=0;h<m;h++){
                        mR[i][j]+=m1[i][h]*m2[h][j];
                    }
                
                }
            }
            println mR
        }else{
            throw new Exception("El numero de filas de m1 debe coincidir con el numero de columnas de m2");
        }
    }
    public void sumar(){
        if(m==p){
            def mR=new int[m][p]
            for(int i=0; i<m; i++){
                for(int j=0; j<m; j++){
                    mR[i][j]=m1[i][j]+m2[i][j];
                }
            }
            println mR
        }
    }
    
    public void restar(){
        def mR=new int[m][p]
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                mR[i][j]=m1[i][j]-m2[i][j];
            }
        }
        println mR
    }
}

