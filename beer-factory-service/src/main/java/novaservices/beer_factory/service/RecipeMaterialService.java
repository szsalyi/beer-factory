package novaservices.beer_factory.service;

import novaservices.beer_factory.vos.RecipeMaterialVO;

import java.util.List;

public interface RecipeMaterialService {
    RecipeMaterialVO create(RecipeMaterialVO recipeMaterialVO);
    void assignRecipeId(List<RecipeMaterialVO> recipeMaterialVOS);
}
