/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package redneuronalgroovy
/**
 *
 * @author Jorge Esteban
 */
class RedNeuronal {
    def tamanoEntradas=2
    def tamanoSalidas=4
    def numeroNeuronas=tamanoSalidas
    def conjuntoDatos=[]
    def w=[tamanoEntradas][numeroNeuronas]
    def b=[numeroNeuronas]
    public RedNeuronal(){
        iniciar()
        
    }
    
    public static void main(String[] args){
       new RedNeuronal()
    }
    
    def inicializarVariables={->
        for(def i=0;i<tamanoEntradas;i++){
            for(def j=0;j<numeroNeuronas;j++){
                w[tamanoEntradas][numeroNeuronas]=new Random().nextInt() % -2+2
            }
        }
    }
    
    def iniciar={->
        generarDatos()
      //  inicializarVariables()
       def x=[10][10]
       x[0][1]=1
    }
    
    def generarDatos={->
        conjuntoDatos.add(new Perceptron("E1",2,0,1,0,0,0))
        conjuntoDatos.add(new Perceptron("E2",2,1,1,0,0,0))
        conjuntoDatos.add(new Perceptron("E3",1,1,0,1,0,0))
        conjuntoDatos.add(new Perceptron("E4",0,2,0,1,0,0))
        conjuntoDatos.add(new Perceptron("E5",-1,0,0,0,1,0))
        conjuntoDatos.add(new Perceptron("E6",-2,0,0,0,1,0))
        conjuntoDatos.add(new Perceptron("E7",0,-2,0,0,0,1))
        conjuntoDatos.add(new Perceptron("E8",0,-1,0,0,0,1))
    }
}

