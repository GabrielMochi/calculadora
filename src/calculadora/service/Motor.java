package calculadora.service;

public class Motor {

    private static final char MEIA_RISCA = '–';

    public static String calcResultado(String formula) throws IllegalArgumentException {
        String[] numeros;
        String[] operadoresBasicos;

        numeros = formula.replace(",", ".").split("([+]|[" + MEIA_RISCA + "])");
        operadoresBasicos = new String[(numeros.length > 0) ? numeros.length - 1 : 0];

        if (operadoresBasicos.length > 0) {
            for (int i = 0, tamanhoNumeroAnterior = 0; i < numeros.length; i++) {
                if (i < operadoresBasicos.length) {
                    if (formula.charAt(tamanhoNumeroAnterior + numeros[i].length()) == '+'
                            || formula.charAt(tamanhoNumeroAnterior + numeros[i].length()) == MEIA_RISCA) {
                        operadoresBasicos[i] = String.valueOf(formula.charAt(tamanhoNumeroAnterior + numeros[i].length()));
                        tamanhoNumeroAnterior += numeros[i].length() + 1;
                    } else {
                        throw new IllegalArgumentException("ERRO De Sintaxe!");
                    }
                }

                if (numeros[i].contains("*") && numeros[i].contains("/")) {
                    String[] numerosMultiplicados;
                    String[] multiplicadores;

                    numerosMultiplicados = numeros[i].split("[*]");
                    multiplicadores = new String[numerosMultiplicados.length - 1];

                    for (int j = 0, tamanhoNumeroMultiplicadoAnterior = 0; j < numerosMultiplicados.length; j++) {
                        if (j < multiplicadores.length) {
                            if (numeros[i].charAt(tamanhoNumeroMultiplicadoAnterior + numerosMultiplicados[j].length()) == '*') {
                                multiplicadores[j] = String.valueOf(numeros[i].charAt(tamanhoNumeroMultiplicadoAnterior + numerosMultiplicados[j].length()));
                                tamanhoNumeroMultiplicadoAnterior += numerosMultiplicados[j].length() + 1;
                            } else {
                                throw new IllegalArgumentException("ERRO De Sintaxe!");
                            }
                        }

                        if (numerosMultiplicados[j].contains("/")) {
                            String[] numerosDivididos;
                            String[] divisores;

                            numerosDivididos = numerosMultiplicados[j].split("[/]");
                            divisores = new String[numerosDivididos.length - 1];

                            for (int k = 0, tamanhoNumeroDivididoAnterior = 0; k < numerosDivididos.length; k++) {
                                if (k < divisores.length) {
                                    if (numerosMultiplicados[j].charAt(tamanhoNumeroDivididoAnterior + numerosDivididos[k].length()) == '/') {
                                        divisores[k] = String.valueOf(numerosMultiplicados[j].charAt(tamanhoNumeroDivididoAnterior + numerosDivididos[k].length()));
                                        tamanhoNumeroDivididoAnterior += numerosDivididos[k].length() + 1;
                                    } else {
                                        throw new IllegalArgumentException("ERRO De Sintaxe!");
                                    }
                                }
                            }

                            double resultadoDivisao = 0;
                            for (int k = 0; k < numerosDivididos.length - 1; k++) {
                                double arg1, arg2 = Double.parseDouble(numerosDivididos[k + 1]);

                                if (k == 0) {
                                    arg1 = Double.parseDouble(numerosDivididos[k]);
                                } else {
                                    arg1 = resultadoDivisao;
                                }

                                resultadoDivisao = arg1 / arg2;
                            }

                            numerosMultiplicados[j] = String.valueOf(resultadoDivisao);

                        }
                    }

                    double resultadoMultiplicaco = 0;
                    for (int j = 0; j < numerosMultiplicados.length - 1; j++) {
                        double arg1, arg2 = Double.parseDouble(numerosMultiplicados[j + 1]);

                        if (j == 0) {
                            arg1 = Double.parseDouble(numerosMultiplicados[j]);
                        } else {
                            arg1 = resultadoMultiplicaco;
                        }

                        resultadoMultiplicaco = arg1 * arg2;
                    }

                    numeros[i] = String.valueOf(resultadoMultiplicaco);

                } else if (numeros[i].contains("*")) {
                    String[] numerosMultiplicados;
                    String[] multiplicadores;

                    numerosMultiplicados = numeros[i].split("[*]");
                    multiplicadores = new String[numerosMultiplicados.length - 1];

                    for (int j = 0, tamanhoNumeroMultiplicadoAnterior = 0; j < numerosMultiplicados.length; j++) {
                        if (j < multiplicadores.length) {
                            if (numeros[i].charAt(tamanhoNumeroMultiplicadoAnterior + numerosMultiplicados[j].length()) == '*') {
                                multiplicadores[j] = String.valueOf(numeros[i].charAt(tamanhoNumeroMultiplicadoAnterior + numerosMultiplicados[j].length()));
                                tamanhoNumeroMultiplicadoAnterior += numerosMultiplicados[j].length() + 1;
                            } else {
                                throw new IllegalArgumentException("ERRO De Sintaxe!");
                            }
                        }
                    }

                    double resultadoMultiplicaco = 0;
                    for (int j = 0; j < numerosMultiplicados.length - 1; j++) {
                        double arg1, arg2 = Double.parseDouble(numerosMultiplicados[j + 1]);

                        if (j == 0) {
                            arg1 = Double.parseDouble(numerosMultiplicados[j]);
                        } else {
                            arg1 = resultadoMultiplicaco;
                        }

                        resultadoMultiplicaco = arg1 * arg2;
                    }

                    numeros[i] = String.valueOf(resultadoMultiplicaco);

                } else if (numeros[i].contains("/")) {

                    String[] numerosDivididos;
                    String[] divisores;

                    numerosDivididos = numeros[i].split("[/]");
                    divisores = new String[numerosDivididos.length - 1];

                    for (int j = 0, tamanhoNumeroDivididoAnterior = 0; j < numerosDivididos.length; j++) {
                        if (j < divisores.length) {
                            if (numeros[i].charAt(tamanhoNumeroDivididoAnterior + numerosDivididos[j].length()) == '/') {
                                divisores[j] = String.valueOf(numeros[i].charAt(tamanhoNumeroDivididoAnterior + numerosDivididos[j].length()));
                                tamanhoNumeroDivididoAnterior += numerosDivididos[j].length() + 1;
                            } else {
                                throw new IllegalArgumentException("ERRO De Sintaxe!");
                            }
                        }
                    }

                    double resultadoDivisao = 0;
                    for (int j = 0; j < numerosDivididos.length - 1; j++) {
                        double arg1, arg2 = Double.parseDouble(numerosDivididos[j + 1]);

                        if (j == 0) {
                            arg1 = Double.parseDouble(numerosDivididos[j]);
                        } else {
                            arg1 = resultadoDivisao;
                        }

                        resultadoDivisao = arg1 / arg2;
                    }

                    numeros[i] = String.valueOf(resultadoDivisao);

                }
            }

            double resultado = 0;
            for (int i = 0; i < numeros.length - 1; i++) {
                double arg1, arg2 = Double.parseDouble(numeros[i + 1]);

                if (i == 0) {
                    arg1 = Double.parseDouble(numeros[i]);
                } else {
                    arg1 = resultado;
                }

                if (operadoresBasicos[i].equals("+")) {
                    resultado = arg1 + arg2;
                } else if (operadoresBasicos[i].equals(String.valueOf(MEIA_RISCA))) {
                    resultado = arg1 - arg2;
                } else {
                    throw new IllegalArgumentException("ERRO De Sintaxe!");
                }
            }

            return String.valueOf(resultado);
        } else {
            if (numeros[0].contains("*") && numeros[0].contains("/")) {
                String[] numerosMultiplicados;
                String[] multiplicadores;

                numerosMultiplicados = numeros[0].split("[*]");
                multiplicadores = new String[numerosMultiplicados.length - 1];

                for (int j = 0, tamanhoNumeroMultiplicadoAnterior = 0; j < numerosMultiplicados.length; j++) {
                    if (j < multiplicadores.length) {
                        if (numeros[0].charAt(tamanhoNumeroMultiplicadoAnterior + numerosMultiplicados[j].length()) == '*') {
                            multiplicadores[j] = String.valueOf(numeros[0].charAt(tamanhoNumeroMultiplicadoAnterior + numerosMultiplicados[j].length()));
                            tamanhoNumeroMultiplicadoAnterior += numerosMultiplicados[j].length() + 1;
                        } else {
                            throw new IllegalArgumentException("ERRO De Sintaxe!");
                        }
                    }

                    if (numerosMultiplicados[j].contains("/")) {
                        String[] numerosDivididos;
                        String[] divisores;

                        numerosDivididos = numerosMultiplicados[j].split("[/]");
                        divisores = new String[numerosDivididos.length - 1];

                        for (int k = 0, tamanhoNumeroDivididoAnterior = 0; k < numerosDivididos.length; k++) {
                            if (k < operadoresBasicos.length) {
                                if (numerosMultiplicados[j].charAt(tamanhoNumeroDivididoAnterior + numerosDivididos[k].length()) == '/') {
                                    divisores[k] = String.valueOf(numerosMultiplicados[j].charAt(tamanhoNumeroDivididoAnterior + numerosDivididos[k].length()));
                                    tamanhoNumeroDivididoAnterior += numerosDivididos[k].length() + 1;
                                } else {
                                    throw new IllegalArgumentException("ERRO De Sintaxe!");
                                }
                            }
                        }

                        double resultadoDivisao = 0;
                        for (int k = 0; k < numerosDivididos.length - 1; k++) {
                            double arg1, arg2 = Double.parseDouble(numerosDivididos[k + 1]);

                            if (k == 0) {
                                arg1 = Double.parseDouble(numerosDivididos[k]);
                            } else {
                                arg1 = resultadoDivisao;
                            }

                            resultadoDivisao = arg1 / arg2;
                        }

                        numerosMultiplicados[j] = String.valueOf(resultadoDivisao);

                    }
                }

                double resultadoMultiplicaco = 0;
                for (int j = 0; j < numerosMultiplicados.length - 1; j++) {
                    double arg1, arg2 = Double.parseDouble(numerosMultiplicados[j + 1]);

                    if (j == 0) {
                        arg1 = Double.parseDouble(numerosMultiplicados[j]);
                    } else {
                        arg1 = resultadoMultiplicaco;
                    }

                    resultadoMultiplicaco = arg1 * arg2;
                }

                return String.valueOf(resultadoMultiplicaco);
            } else if (numeros[0].contains("*")) {
                String[] numerosMultiplicados;
                String[] multiplicadores;

                numerosMultiplicados = numeros[0].split("[*]");
                multiplicadores = new String[numerosMultiplicados.length - 1];

                for (int j = 0, tamanhoNumeroMultiplicadoAnterior = 0; j < numerosMultiplicados.length; j++) {
                    if (j < multiplicadores.length) {
                        if (numeros[0].charAt(tamanhoNumeroMultiplicadoAnterior + numerosMultiplicados[j].length()) == '*') {
                            multiplicadores[j] = String.valueOf(numeros[0].charAt(tamanhoNumeroMultiplicadoAnterior + numerosMultiplicados[j].length()));
                            tamanhoNumeroMultiplicadoAnterior += numerosMultiplicados[j].length() + 1;
                        } else {
                            throw new IllegalArgumentException("ERRO De Sintaxe!");
                        }
                    }
                }

                double resultadoMultiplicaco = 0;
                for (int j = 0; j < numerosMultiplicados.length - 1; j++) {
                    double arg1, arg2 = Double.parseDouble(numerosMultiplicados[j + 1]);

                    if (j == 0) {
                        arg1 = Double.parseDouble(numerosMultiplicados[j]);
                    } else {
                        arg1 = resultadoMultiplicaco;
                    }

                    resultadoMultiplicaco = arg1 * arg2;
                }

                return String.valueOf(resultadoMultiplicaco);
            } else if (numeros[0].contains("/")) {
                String[] numerosDivididos;
                String[] divisores;

                numerosDivididos = numeros[0].split("[/]");
                divisores = new String[numerosDivididos.length - 1];

                for (int j = 0, tamanhoNumeroDivididoAnterior = 0; j < numerosDivididos.length; j++) {
                    if (j < divisores.length) {
                        if (numeros[0].charAt(tamanhoNumeroDivididoAnterior + numerosDivididos[j].length()) == '/') {
                            divisores[j] = String.valueOf(numeros[0].charAt(tamanhoNumeroDivididoAnterior + numerosDivididos[j].length()));
                            tamanhoNumeroDivididoAnterior += numerosDivididos[j].length() + 1;
                        } else {
                            throw new IllegalArgumentException("ERRO De Sintaxe!");
                        }
                    }
                }

                double resultadoDivisao = 0;
                for (int j = 0; j < numerosDivididos.length - 1; j++) {
                    double arg1, arg2 = Double.parseDouble(numerosDivididos[j + 1]);

                    if (j == 0) {
                        arg1 = Double.parseDouble(numerosDivididos[j]);
                    } else {
                        arg1 = resultadoDivisao;
                    }

                    resultadoDivisao = arg1 / arg2;
                }

                return String.valueOf(resultadoDivisao);
            } else {
                throw new IllegalArgumentException("ERRO De Sintaxe!");
            }
        }
    }

    public static String calcResultado(char[] caracteres) throws IllegalArgumentException {
        String formula = new String(caracteres);
        return calcResultado(formula);
    }

}
