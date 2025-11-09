
public abstract class Veiculo {
   
    protected String marca;
    protected String modelo;
    protected int ano;

   
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

   
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Veículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

   
    public abstract void acelerar();
}

// ----------------------------------------------------


class Carro extends Veiculo {
    private double tempo0a100;

    public Carro(String marca, String modelo, int ano, double tempo0a100) {
        super(marca, modelo, ano); 
        this.tempo0a100 = tempo0a100;
    }

   
    @Override
    public void acelerar() {
        System.out.printf("%s %s está acelerando de 0 a 100 km/h em %.1f segundos.%n", 
            modelo, marca, tempo0a100);
    }
}

// ----------------------------------------------------


class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    
    @Override
    public void acelerar() {
        System.out.printf("%s %s está acelerando e empinando a roda dianteira!%n", 
            modelo, marca);
    }
}

// ----------------------------------------------------


class Caminhao extends Veiculo {
    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

   
    @Override
    public void acelerar() {
        System.out.printf("%s %s está engrenando a próxima marcha e acelerando lentamente.%n", 
            modelo, marca);
    }
}

// ----------------------------------------------------


public class SistemaVeiculos {
    public static void main(String[] args) {
        System.out.println("--- Teste de Abstração e Polimorfismo ---");
        
        
        Veiculo carro = new Carro("Ford", "Mustang", 2024, 4.5);
        Veiculo moto = new Moto("Honda", "CBR 1000RR", 2023);
        Veiculo caminhao = new Caminhao("Volvo", "FH 540", 2022);
        
        

        System.out.println("\n--- Testando o Carro ---");
        carro.exibirDetalhes(); 
        carro.acelerar();       
        
        System.out.println("\n--- Testando a Moto ---");
        moto.exibirDetalhes(); 
        moto.acelerar();       

        System.out.println("\n--- Testando o Caminhão ---");
        caminhao.exibirDetalhes(); 
        caminhao.acelerar();       
        
        System.out.println("------------------------------------------");
    }
}