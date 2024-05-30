package main.java.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    // atributo
    private Map<LocalDate, Evento> eventosMap;

    // construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEventos(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    // ordenação de Map
    public void ordenarEventos() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        eventosMap = eventosTreeMap;
        System.out.println(eventosMap);
    }

    public void obterProximoEvento() {
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) ||entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: "+ proximaData + " acontecerá na data " + proximoEvento);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEventos(LocalDate.of(2021, 10, 10), "Festa de aniversário", "Café da manhã");

    }
}
