

package com.easytasks.dataTransferObjects;

/**
 *
 * @author alejandrotocar
 */
public class DtoActividad extends DtoRealizable{
    private boolean automatica;

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    //TODO: Chequear que en el contstructor no haya que hacer nada.
    public DtoActividad() {
    }
}
