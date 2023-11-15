buid-image:
	@ docker build -f devops/Dockerfile -t proyecto-backend:1 . 
volume: 
	@ docker volume create pg_proyecto_grouptravel_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/docker-compose.yml proyecto
rm:
	@ docker stack rm proyecto