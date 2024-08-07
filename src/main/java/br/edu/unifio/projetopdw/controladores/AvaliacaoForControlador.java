package br.edu.unifio.projetopdw.controladores;

import entidades.AvaliacaoForEntidades;
import entidades.Produto;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Messages;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class AvaliacaoForControlador {

    private AvaliacaoForEntidades AvaliacaoForEntidades = new AvaliacaoForEntidades();

    public void salvar(){

        Messages.addFlashGlobalInfo("Registro salvo com sucesso =)");


    }

    public void salvarendereco(){

        Messages.addFlashGlobalInfo("Endereço salvo com sucesso =)");



    }

}
