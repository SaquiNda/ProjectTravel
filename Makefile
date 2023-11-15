buid-image:
	@ docker build -f devops/Dockerfile -t groupTravelPI:1 . 
volume: 
	@ docker volume create pg_proyecto_grouptravel_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml travelPI
rm:
	@ docker stack rm travelPI