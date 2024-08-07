package br.edu.unifio.projetopdw.controladores;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class TrabalhoPar1Controlador {

    private  Double ValorDigitado;
    private  Double Cotacao;
    private  Double Resultado;

    public void converter(){

        Resultado = ValorDigitado * Cotacao;

    }

}
