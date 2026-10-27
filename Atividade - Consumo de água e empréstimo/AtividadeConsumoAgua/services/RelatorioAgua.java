package services;
import models.ConsumoAgua;

public class RelatorioAgua {
	public static void emitirRelatorio(ConsumoAgua consumo) {
		
		System.out.println("--RELATÓRIO DE CONSUMO DE ÁGUA ╰(*´︶`*)╯--");
		System.out.println("Nome do usuário: " + consumo.getNome());
		System.out.println("Limite Diário: " + consumo.getLimiteDiario() + " litros ﾍ(･_|");
        System.out.println("Consumo Diário: " + consumo.getConsumoDiario() + " litros ヽ(°〇°)ﾉ");
        
        if (consumo.getConsumoDiario() > 180 && consumo.getLimiteDiario() < 10) {
            System.out.println("Atenção " + consumo.getNome() + "!! Seu consumo diário passou do limite de 180 litros e seu limite diário está abaixo do padrão! (￣ヘ￣)");
        }
        else if(consumo.getConsumoDiario() > 180 && consumo.getLimiteDiario() >= 10) {
        	System.out.println("Atenção " + consumo.getNome() + "!! Seu consumo diário passou do limite de 180 litros, mas seu diário está dentro dos limites! (＞﹏＜)");
        }
        else if(consumo.getConsumoDiario() <= 180 && consumo.getLimiteDiario() < 10) {
        	System.out.print("Atenção " + consumo.getNome() + "!! A quantidade do seu consumo diário está regular, mas o seu limite diário está abaixo do padrão! (⇀‸↼‶)");
        } else {
        	System.out.print(consumo.getNome() + " seu consumo diário e seu limite diário estão regularzados. ( ´ ∀ `)ノ");
        }
	}

}