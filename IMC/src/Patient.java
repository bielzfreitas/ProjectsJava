
public class Patient {

	public double weight;
    public double height;
    public double BMI;

    public Patient(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculationBMI() {

        BMI = weight / (height * height);
        return BMI;

    }

    public String diagnosis(double BMI) {

        if (BMI < 16) {
            return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
        
        } else if (BMI >= 16 && BMI < 17) {
            return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
        
        } else if (BMI >= 17 && BMI < 18.5) {
            return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
        
        } else if (BMI >= 18.5 && BMI < 25) {
            return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
        
        } else if (BMI >= 25 && BMI < 30) {
            return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
        
        } else if (BMI >= 30 && BMI < 35) {
            return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
        
        } else if (BMI >= 35 && BMI < 40) {
            return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
        
        } else {
            return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
        }

    }
}
