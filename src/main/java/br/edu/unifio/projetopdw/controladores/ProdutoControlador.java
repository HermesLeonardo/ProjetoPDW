package br.edu.unifio.projetopdw.controladores;

import entidades.Produto;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Messages;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class ProdutoControlador {

    private Produto produto = new Produto();

    public void salvar(){

        Messages.addFlashGlobalInfo("Registro salvo com sucesso =)");


    }

}
