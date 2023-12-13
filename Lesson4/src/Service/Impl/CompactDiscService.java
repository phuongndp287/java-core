package Service.Impl;

import Model.CompactDiscVo;
import Service.ICompactDiscService;

import java.util.Comparator;
import java.util.List;


public class CompactDiscService implements ICompactDiscService {
    @Override
    public boolean addCompactDisc(List<CompactDiscVo> compactDiscList, Long compactDiscId) {
        boolean isExist = false;
        if (!compactDiscList.isEmpty()) {
            for (CompactDiscVo compactDisc: compactDiscList) {
                if (compactDisc.getId() == compactDiscId) {
                    isExist = true;
                    break;
                }
            }
        }
        return isExist;
    }

    @Override
    public Long getQtyCompactDisc(List<CompactDiscVo> compactDiscList) {
        return Long.valueOf(compactDiscList.size());
    }

    @Override
    public Double getTotalPrice(List<CompactDiscVo> compactDiscList) {
        Double priceTotal = Double.valueOf(0);
        for (CompactDiscVo compactDisc: compactDiscList) {
            priceTotal = priceTotal + compactDisc.getPrice();
        }
        return priceTotal;
    }

    @Override
    public void orderDescByPrice(List<CompactDiscVo> compactDiscList) {
        if (!compactDiscList.isEmpty()) {
            compactDiscList.sort(Comparator.comparingDouble(CompactDiscVo::getPrice).reversed());
        }
    }

    @Override
    public void orderAscByTitle(List<CompactDiscVo> compactDiscList) {
        if (!compactDiscList.isEmpty()) {
            compactDiscList.sort(Comparator.comparing(CompactDiscVo::getName));
        }
    }

    @Override
    public void exportAll(List<CompactDiscVo> compactDiscList) {
        for (CompactDiscVo compactDisc : compactDiscList) {
            compactDisc.toString();
        };
    }
}
