package Funciones_Nivel_5;

public class FuncionesConversion {

    // ================= TEMPERATURA =================

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // ================= LONGITUD =================

    public static double metrosAKilometros(double metros) {
        return metros / 1000;
    }

    public static double kilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }

    public static double kilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }

    public static double millasAKilometros(double millas) {
        return millas / 0.621371;
    }

    // ================= PESO =================

    public static double kilogramosALibras(double kg) {
        return kg * 2.20462;
    }

    public static double librasAKilogramos(double libras) {
        return libras / 2.20462;
    }

    public static double kilogramosAOnzas(double kg) {
        return kg * 35.274;
    }

    public static double onzasAKilogramos(double onzas) {
        return onzas / 35.274;
    }

    // ================= TIEMPO =================

    public static double segundosAMinutos(double segundos) {
        return segundos / 60;
    }

    public static double minutosAHoras(double minutos) {
        return minutos / 60;
    }

    public static double horasAMinutos(double horas) {
        return horas * 60;
    }

    public static double minutosASegundos(double minutos) {
        return minutos * 60;
    }
}