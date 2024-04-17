package net.kdigital.ec21.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.kdigital.ec21.dto.ProductDTO;
import net.kdigital.ec21.service.ProductService;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ProductController {
    private final ProductService ProductService;
    
    /**
     * main/myproducts에서 상품등록 페이지 productsWrite 요청 (회원ID를 받아서 model에 담아 보냄)
     * 
     * @return
     */
    @GetMapping("/main/productsWrite")
    public String productsWrite(@RequestParam(name = "customerId", defaultValue = "jooyoungyoon") String customerId, Model model) {
        model.addAttribute("customerId", customerId);
        return "/main/productsWrite";
    }

    /**
     * 전달받은 상품 아이디에 해당하는 상품DTO를 model에 담아 상품 디테일 페이지로 보냄
     * 
     * @param productId
     * @param model
     * @return
     */
    @GetMapping("/main/productsDetail")
    public String productsDetail(@RequestParam(name = "productId", defaultValue = "CO00006-20240409") String productId, Model model) {
        ProductDTO dto = ProductService.getProduct(productId);
        model.addAttribute("product", dto);
        return "/main/productsDetail";
    }

    /**
     * 전달받은 상품 카테고리와 검색어에 해당하는 상품 리스트를 model에 담아 상품 목록 페이지로 보냄
     * 
     * @param category
     * @param model
     * @return 
     */
    @GetMapping("/main/list")
    public String list(@RequestParam(name = "category", defaultValue = "total") String category,
            @RequestParam(name = "searchWord", defaultValue = "") String searchWord, Model model) {
        List<ProductDTO> dtoList = ProductService.getProductList(category, searchWord);
        log.info("=========== 카테고리 : {}",category);
        log.info("=========== 검색어 : {}",searchWord);

        model.addAttribute("list", dtoList);
        model.addAttribute("category", category);
        model.addAttribute("searchWord", searchWord);
        
        return "/main/list";
    }


}
