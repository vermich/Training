package visionneuse;

import ij.IJ;
import ij.ImagePlus;

public class VisionneuseTraining {

	public static void main(String[] args) {
		ImagePlus imp = IJ.openImage(); // Choisit un fichier et stocke le r�sultat dans imp
		imp.show(); // Affiche l'image � l'�cran
	}

}
