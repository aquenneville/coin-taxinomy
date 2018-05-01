package com.example.demo.persistence;
import java.util.Collection;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.OwnerPortfolio;
import com.example.demo.model.OwnerPortfolioAsset;

@Mapper
public interface OwnerPortfolioAssetMapper {

	@Select("SELECT id, asset_id, company_portfolio_id FROM company_portfolio_asset WHERE id = #{id}")	
	OwnerPortfolioAsset selectById(@Param("id") long id);

	@Insert("INSERT INTO company_portfolio_asset (asset_id, company_portfolio_id) VALUES(#{asset.id}, #{companyPortfolio.id})")
	@Options(useGeneratedKeys=true)
	long insert(OwnerPortfolioAsset article);

	@Update("UPDATE artist SET (asset_id=#{asset.id}, company_portfolio_id=#{companyPortfolio.id}) WHERE id=#{id}")
	void update(OwnerPortfolioAsset companyPortfolioItem);

	@Delete("DELETE FROM company_portfolio_asset WHERE id = #{id}")
	void deleteById(int id);

	@Select("SELECT * FROM company_portfolio_asset")
	Collection<OwnerPortfolioAsset> selectAll();
}
