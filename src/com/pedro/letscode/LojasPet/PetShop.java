package com.pedro.letscode.LojasPet;

import com.pedro.letscode.Animal;
import com.pedro.letscode.Cachorro;

public class PetShop {

		public void tomarBanho(Animal animal) {
			
			animal.setEstadoDeEspirito("Limpo");
			
		}
		
		public void tosar(Cachorro cachorro) {
			cachorro.setEstadoDeEspirito("Tosado");
		}
		
		public void deixarHotel(Animal animal) {
			animal.setEstadoDeEspirito("Saudade");
		}
}
