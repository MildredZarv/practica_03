/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

/**
 *
 * @author MildReed Zaarv'
 */
public class ObjetoExistente extends Exception {

    /**
     * Creates a new instance of <code>ObjetoExistente</code> without detail
     * message.
     */
    public ObjetoExistente() {
    }

    /**
     * Constructs an instance of <code>ObjetoExistente</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ObjetoExistente(String msg) {
        super(msg);
    }
}
