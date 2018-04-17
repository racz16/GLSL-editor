#version 460 core
#pragma optimize(off)

struct light{
	vec3 diffuse;
	vec3 specular;
	vec3 ambient;        
};

#line 0
mat4 computeViewMatrix(vec3 forward, vec3 right, vec3 up);

//egysoros komment
void main(){
	int i = 0;
	while(i<100){
		computeViewMatrix(i, i+1, i+2);
		i += 1;
	}
}

mat4 computeViewMatrix(vec3 forward, vec3 right, vec3 up){
	return forward + right + up;
}

/* ez egy 
   többsoros
   komment
*/