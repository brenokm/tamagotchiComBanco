package Classes;

import Classes.Tamago;
import Classes.Remedios;
import Classes.Brinquedos;
import Classes.Comidas;

public class Acoes {
    Tamago tamago = new Tamago();
    Remedios remedio = new Remedios();
    Comidas comida = new Comidas();
    Brinquedos brinquedo = new Brinquedos();
    
    public void comer(){
        int saude = tamago.getSaude_tamago()+comida.getMelhora_saude_comida();
        tamago.setSaude_tamago(saude);
        int mental = tamago.getEstadoM_tamago()+comida.getMelhora_estadoM_comida();
        tamago.setEstadoM_tamago(mental);
        int energia = tamago.getEnergia_tamago()+comida.getMelhora_energia_comida();
        tamago.setEnergia_tamago(energia);
        int fome = tamago.getFome_tamago()-comida.getMelhora_fome_comida();
        tamago.setFome_tamago(fome);
        int sono = tamago.getSono_tamago()-comida.getPiora_sono_comida();
        tamago.setSono_tamago(sono);
        int level = tamago.getLevel_tamago()+1;
        tamago.setLevel_tamago(level);
        
    }
    
    public void dormir(){
        int saude = tamago.getSaude_tamago()+5;
        tamago.setSaude_tamago(saude);
        int mental = tamago.getEstadoM_tamago()+5;
        tamago.setEstadoM_tamago(mental);
        int energia = tamago.getEnergia_tamago()+10;
        tamago.setEnergia_tamago(energia);
        int fome = tamago.getFome_tamago()-2;
        tamago.setFome_tamago(fome);
        int sono = tamago.getSono_tamago()-10;
        tamago.setSono_tamago(sono);
        int level = tamago.getLevel_tamago()+1;
        tamago.setLevel_tamago(level);
    }
    
    public void brincar(){
        int sono = tamago.getSono_tamago()-brinquedo.getPiora_sono_brinquedo();
        tamago.setSono_tamago(sono);
        int higiene = tamago.getHigiene_tamago()-brinquedo.getPiora_higiene_brinquedo();
        tamago.setHigiene_tamago(higiene);
        int energia = tamago.getEnergia_tamago()-brinquedo.getPiora_energia_brinquedo();
        tamago.setEnergia_tamago(energia);
        int fome = tamago.getFome_tamago()-brinquedo.getPiora_fome_brinquedo();
        tamago.setFome_tamago(fome);
        int saude = tamago.getSaude_tamago()+brinquedo.getMelhora_saude_brinquedo();
        tamago.setSaude_tamago(saude);
        int mental = tamago.getEstadoM_tamago()+brinquedo.getMelhora_estadoM_brinquedo();
        tamago.setEstadoM_tamago(mental);
        int level = tamago.getLevel_tamago()+5;
        tamago.setLevel_tamago(level);
    }
    
    public void tomarRemedio(){
       int saude = tamago.getSaude_tamago()+remedio.getMelhora_saude_remedio();
       tamago.setSaude_tamago(saude);
    }
    
    public void banhar(){
        int higiene = tamago.getHigiene_tamago()+10;
        tamago.setHigiene_tamago(higiene);
        int saude = tamago.getSaude_tamago()+2;
        tamago.setSaude_tamago(saude);
        int level = tamago.getLevel_tamago()+1;
        tamago.setLevel_tamago(level);
    }
    
    public void interagir(){
        int level = tamago.getLevel_tamago()+10;
        tamago.setLevel_tamago(level);
    }
  
}
