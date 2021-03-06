package ai.cotogoto.noby.model;

import lombok.Data;

/**
 * ネガポジData.
 *
 * @author H.Aoshima
 * @version 1.0
 */
@Data
public class Negaposi {

    /**
     * 単語.
     */
    private String word;

    /**
     * 判定.
     */
    private float  score;

}
