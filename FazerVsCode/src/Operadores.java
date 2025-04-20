public class Operadores {

    // Operadores Aritmétricos

    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1 * v2;
    }

    public float divisao(float v1, float v2) {
        return v1 / v2;
    }

    public float modulo(float v1, float v2){
        return v1 % v2;
    }

    //Operadores de Atribuição
    public float at_adicao(float v1, float v2){
        return v1 += v2;
    }
    public float at_subtracao(float v1, float v2){
        return v1 -= v2;
    }
    public float at_multiplicacao(float v1, float v2){
        return v1 *= v2;
    }
    public float at_divisao(float v1, float v2){
        return v1 /= v2;
    }
    public float at_simples(float v1, float v2){
        return v1 = v2;
    }

    //Operadores de Comparação
    public boolean igual(float v1, float v2){
        return v1 == v2;
    }
    public boolean diferente(float v1, float v2){
        return v1 != v2;
    }
    public boolean menor(float v1, float v2){
        return v1 < v2;
    }
    public boolean maior(float v1, float v2){
        return v1 > v2;
    }
    public boolean menor_igual(float v1, float v2){
        return v1 <= v2;
    }
    public boolean maior_igual(float v1, float v2){
        return v1 >= v2;
    }

    //Operadores de Lógicos
    public boolean l_and(boolean v1, boolean v2){
        return v1 && v2;
    }
    public boolean bl_and(boolean v1, boolean v2){
        return v1 & v2;
    }
    public boolean l_or(boolean v1, boolean v2){
        return v1 || v2;
    }
    public boolean bli_or(boolean v1, boolean v2){
        return v1 | v2;
    }
    public boolean ble_or(boolean v1, boolean v2){
        return v1 ^ v2;
    }
    public boolean NOT(boolean v1, boolean v2){
        return v1 != v2;
    }

}
