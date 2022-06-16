package eraser;

public class Eraser {

	/**
	 * Enleve les espaces individuels d'une chaine de caracteres.
	 * Par exemple, "He ll o   you!" devient "Hello   you!"
	 * 
	 * @param str une chaine de caractere, non null.
	 * @return la meme chaine sans espaces individuels.
	 */
    public static String erase(String str) {
        return str.replaceAll("(^|[^ ]) (?=[^ ]|$)", "$1");
        /* 
         * Constituants de l'expression reguliere
         * 
         * - Debut de chaine : ^
         * - Caractere espace : " "
         * - Caractere non-espace : [^ ]
         * - Fin de chaine : $
         * 
         * Gestion des groupes
         * 
         * - Groupe ordinaire : (...)
         * - Groupe lu mais pas inclus dans le motif reconnu : (?=...)
         * 
         * Expression complete
         * 
         *  "(^|[^ ])"              debut de chaine ou non espace (devient $1)
         *           " "            un espace
         *             "(?=[^ ]|$)" non espace ou fin de chaine (sera relu)
         */
    }
}
