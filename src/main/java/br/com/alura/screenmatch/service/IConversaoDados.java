package br.com.alura.screenmatch.service;

public interface IConversaoDados {

    <T> T obterDados(String json, Class<T> classe);
}
