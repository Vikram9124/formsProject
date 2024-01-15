// user.service.ts
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user.module';


@Injectable({
  providedIn: 'root',
})
export class UserService {
  private postform='http://localhost:8080/api/postForm'
  private getform = 'http://localhost:8080/api/getForm';
  private pdf='http://localhost:8080/api/pdf'; 

  constructor(private http: HttpClient) {}

  createUser(user: User): Observable<User> {
    return this.http.post<User>(this.postform, user);
  }

  getAllUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.getform);
  }

}
