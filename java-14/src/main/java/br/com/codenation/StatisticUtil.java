package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		
		int sum = 0;
		for(int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
	return (int) sum/elements.length;

	}

	public static int mode(int[] elements) {
		int mode = 0, count1 = 0;

		// percorre o array
		for(int i = 0; i < elements.length; i++) {
			// percorre o array de novo para comparar o elemento j com cada elemento do array
			int count2 = 0;
			for(int j = 0; j < elements.length; j++) {
				if(elements[i] == elements[j]) {
					count1 ++;
				}
				// compara se na contagem atual (count1) é maior que a contahem anterior( count2)
				if(count1 > count2) {
					// se a contagem atual for maior que a anterior, atribui o valor da contagem atual( count1) a count 2
					count2 = count1; // a ideia é que count2 sempre tenha a contagem da moda
					mode = elements[i];
				}
			}		
		}
		return mode;
	}
	

	public static int median(int[] elements) {
		Arrays.sort(elements);
		int arrayLen = elements.length;
		int halfArray = (int) Math.ceil(arrayLen/2);
		
		if(arrayLen % 2 == 0) {
			return (elements[halfArray] + elements[halfArray + 1])/2;
		}
		
		return elements[halfArray];

	}
}