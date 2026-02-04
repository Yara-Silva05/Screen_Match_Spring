package br.com.alura.screenMatch.service;

public interface IConverteDados {

    <T> T obterdados(String json,  Class <T> classe);
}
