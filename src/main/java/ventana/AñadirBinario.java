/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author IsaelPC
 */
public class AñadirBinario extends ObjectOutputStream {

    public AñadirBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AñadirBinario() throws IOException, SecurityException {
    }

    @Override
    public void writeStreamHeader() throws IOException {//Es el que me coloca la cabecera al principio
        File archivo = new File("registroAtleta.bin");
        if (archivo.length() == 0) {//Si el archivo esta vacio
            //Colocar cabecera
            super.writeStreamHeader();
        } else {
            reset();
        }
    }

}
