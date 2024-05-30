package main.java.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
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

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println(
                    "Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
          LocalDate dataEvento = entry.getKey();
          if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
            proximaData = dataEvento;
            proximoEvento = entry.getValue();
            break;
          }
        }
        if (proximoEvento != null) {
          System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
          System.out.println("Não há eventos futuros na agenda.");
        }
      }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEventos(LocalDate.of(2024, Month.JULY, 12), "Evento 1", "Atração 1");

        agenda.adicionarEventos(LocalDate.of(2024, Month.JULY, 9), "Evento 2", "Atração 2");

        agenda.adicionarEventos(LocalDate.of(2022, Month.JANUARY, 9), "Evento 3", "Atração 3");

        agenda.adicionarEventos(LocalDate.of(2025, Month.JULY, 12), "Evento 4", "Atração 4");

        agenda.adicionarEventos(LocalDate.of(2024, Month.JUNE, 1), "Evento 5", "Atração 5");

        agenda.adicionarEventos(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

        agenda.exibirAgenda();

    }
}
