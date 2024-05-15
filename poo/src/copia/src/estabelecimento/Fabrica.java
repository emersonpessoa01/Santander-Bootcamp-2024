package estabelecimento;

import equipamento.copiadora.Copiadora;
import equipamento.copiadora.Xerox;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.digitalizadora.Scanner;
import equipamento.impressora.Deskjet;
import equipamento.impressora.Impressora;
import equipamento.impressora.Laserjet;
import equipamento.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Deskjet deskjet = new Deskjet();
        Laserjet laserjet = new Laserjet();
        Scanner scanner = new Scanner();
        Xerox xerox = new Xerox();
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        // Impressora impressora = em;
        // Digitalizadora digitalizadora = em;
        // Copiadora copiadora = em;
        Impressora impressora = laserjet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = xerox;



        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}